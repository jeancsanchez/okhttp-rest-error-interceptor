package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server understood the request, but is refusing to fulfill it. Authorization will not help
 * and the request SHOULD NOT be repeated.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object Forbidden : Error(403, "Forbidden")