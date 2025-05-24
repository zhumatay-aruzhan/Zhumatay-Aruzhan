package com.muratcangzm.valorantstore.utils

import okhttp3.Interceptor
import okhttp3.Response

class NetworkInterceptor : Interceptor {


    override fun intercept(chain: Interceptor.Chain): Response {


        val request = chain.request()
        return chain.proceed(request)

    }


}