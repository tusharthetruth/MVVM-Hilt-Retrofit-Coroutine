package com.example.androidboilderplatecode.ui.sample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.boilerplate.base.extensions.showLToast
import com.example.androidboilderplatecode.App
import com.example.androidboilderplatecode.data.sample.SampleDataModel
import com.example.androidboilderplatecode.repository.ApiRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

class SampleActivityViewModel @Inject constructor(private val apiRepository: ApiRepository) :
    ViewModel() {

    private val sampleDataList: MutableLiveData<List<SampleDataModel>> = MutableLiveData()
    private val isLoading: MutableLiveData<Boolean> = MutableLiveData()

    fun provideSampleDataList(): MutableLiveData<List<SampleDataModel>> {
        return sampleDataList
    }

    fun provideIsLoading(): MutableLiveData<Boolean> {
        return isLoading
    }

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        App.instance.showLToast("Exception handled: ${throwable.localizedMessage}")
    }

    fun getSampleEntries() = viewModelScope.launch (exceptionHandler){
        provideIsLoading().postValue(true)
        apiRepository.getSampleEntries().let {
            provideIsLoading().postValue(false)
            val responseJson= JSONObject(it.body().toString())
                val entriesArray=responseJson.getJSONArray("entries")
                val sampleDataList=ArrayList<SampleDataModel>()
                for(i in 0 until entriesArray.length()){
                    val js: JSONObject =entriesArray.getJSONObject(i)
                    val m= SampleDataModel(
                        js.getString("API"),
                        js.getString("Description"),
                        js.getString("Auth"),
                        js.getBoolean("HTTPS"),
                        js.getString("Cors"),
                        js.getString("Link"),
                        js.getString("Category")
                    )
                    sampleDataList.add(m)
                }
            provideSampleDataList().postValue(sampleDataList)
        }
    }
}