When the server returns a response, it also emits a collection of HTTP headers,
 describing its content-type, length, caching directives, validation token, and more. 
 For example, in the above exchange, the server returns a 1024-byte response, instructs the client to cache it for up to 120 seconds,
 and provides a validation token ("x234dff") that can be used after the response has expired to check if the resource has been modified.




Retrofit Cashe :-
==================


---------There are two major ways how clients (apps or browsers) can skip loading the same resource again--------------------

First :- 
         the Cached version is declared valid until a certain time in the future. This is done by the 'Expires'  and  'Cache-Control: max-age headers'


Secound (Conditional Requests ):-
         This is the more modern and preferred 'header'

         When the client accesses the resource, and has not reached the 'Expires' date or 'stepped over the max-age yet'         
         --->it can completely skip any network requests and re-use the cached version