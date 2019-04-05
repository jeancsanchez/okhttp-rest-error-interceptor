package br.com.jeancsanchez.restinterceptor.errors

/**
 * The server encountered an unexpected condition which prevented it from fulfilling the request.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object InternalServerError : Error(500, "Internal Server Error")