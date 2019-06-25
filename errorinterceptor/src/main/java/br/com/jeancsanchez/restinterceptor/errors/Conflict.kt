package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server, while acting as a gateway or proxy, received an invalid response from the upstream
 * server it accessed in attempting to fulfill the request.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 25/06/19.
 * Jesus is alive!
 */
object Conflict : Error(409, "Conflict")