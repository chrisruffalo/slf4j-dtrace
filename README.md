# Distributed Trace Logging

This repo covers a sample extension to the SLF4J API that allows for a logging "context". When
these logs are in one place (across all micro/services) you can have a consistent logging view
of a single system "context".

An example use would be to have all requests for a single request/session logged with the same
logging context.  