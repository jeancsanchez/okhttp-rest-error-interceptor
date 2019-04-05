package br.com.jeancsanchez.restinterceptor.errors

/**
 * The request requires user authentication.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object Unauthorized : Error(401, "Unauthorized")