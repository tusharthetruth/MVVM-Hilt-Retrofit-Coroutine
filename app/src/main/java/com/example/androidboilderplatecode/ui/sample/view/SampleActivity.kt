package com.example.androidboilderplatecode.ui.sample.view


import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidboilderplatecode.R
import com.example.androidboilderplatecode.appbase.AppBaseActivity
import com.example.androidboilderplatecode.data.sample.SampleDataModel
import com.example.androidboilderplatecode.databinding.ActivitySampleBinding
import com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter
import com.example.androidboilderplatecode.ui.sample.viewmodel.SampleActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SampleActivity : AppBaseActivity() {

    @Inject
    lateinit var sampleActivityViewModel: SampleActivityViewModel
    lateinit var binding:ActivitySampleBinding

    private val adapter by lazy{
        SampleDataAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_sample)
        initUi()
        initObservers()
        binding.fetchData.setOnClickListener{
            sampleActivityViewModel.getSampleEntries()
        }

    }
    private fun initUi(){
        binding.rv.adapter=adapter
        binding.rv.layoutManager=LinearLayoutManager(this)
    }
    private fun initObservers(){
        sampleActivityViewModel.provideIsLoading().observe(this,{
                isLoading->
            binding.isPgVisible=isLoading
        })
        sampleActivityViewModel.provideSampleDataList().observe(this,{
                sampleDataList->
            adapter.updateItems(sampleDataList as ArrayList<SampleDataModel>)

        })
    }

}