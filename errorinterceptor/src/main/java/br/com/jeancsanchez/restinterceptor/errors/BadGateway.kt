package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server, while acting as a gateway or proxy, received an invalid response from the upstream
 * server it accessed in attempting to fulfill the request.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object BadGateway : Error(502, "Bad Gateway")