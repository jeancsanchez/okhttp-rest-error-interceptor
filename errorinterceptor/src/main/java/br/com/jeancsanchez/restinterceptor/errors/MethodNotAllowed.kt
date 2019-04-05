package br.com.jeancsanchez.restinterceptor.errors

/**
 * The method specified in the Request-Line is not allowed for the resource identified by the Request-URI.
 * The response MUST include an Allow header containing a list of valid methods for the requested resource.
 * <a href="https://www.restapitutorial.com/httpstatuscodes.html">restapitutorial.com <a/>
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 16/01/19.
 * Jesus is alive!
 */
object MethodNotAllowed : Error(405, "Method Not Allowed")