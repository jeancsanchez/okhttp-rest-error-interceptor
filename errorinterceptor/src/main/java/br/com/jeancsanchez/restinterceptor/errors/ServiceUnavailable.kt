package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server is currently unable to handle the request due to a temporary overloading or maintenance of the server.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object ServiceUnavailable : Error(503, "Service Unavailable")