package br.com.jeancsanchez.restinterceptor.errors

/**
 * The request could not be understood by the server due to malformed syntax.
 * The client SHOULD NOT repeat the request without modifications.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object BadRequest : Error(400, "Bad Request")