package br.com.jeancsanchez.restinterceptor

import br.com.jeancsanchez.restinterceptor.errors.*
import okhttp3.Interceptor
import okhttp3.Response

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 04/04/19.
 * Jesus is alive!
 */

class RestErrorInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)

        when (response.code()) {
            400 -> throw BadRequest
            401 -> throw Unauthorized
            403 -> throw Forbidden
            404 -> throw NotFound
            405 -> throw MethodNotAllowed
            409 -> throw Conflict
            500 -> throw InternalServerError
            502 -> throw BadGateway
            503 -> throw ServiceUnavailable
        }

        return response
    }
}