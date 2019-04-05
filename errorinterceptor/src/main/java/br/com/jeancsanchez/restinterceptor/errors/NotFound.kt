package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server has not found anything matching the Request-URI.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object NotFound : Error(404, "Not Found")