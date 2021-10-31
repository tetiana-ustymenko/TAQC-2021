package com.company;

public enum HTTPErrors {
    ERROR400, ERROR401, ERROR402, ERROR403, ERROR404, ERROR405, ERROR406,
    ERROR407, ERROR408, ERROR409, ERROR410, ERROR411, ERROR412, ERROR413, ERROR414, ERROR415, ERROR416,
    ERROR417, ERROR418, ERROR419, ERROR421, ERROR422, ERROR423, ERROR424, ERROR425, ERROR426, ERROR428,
    ERROR429, ERROR431, ERROR449, ERROR451, ERROR499;

        public String errorName(){
            String errorName;
            switch (this){
                case ERROR400:
                    errorName = "Bad Request";
                    break;
                case ERROR401:
                    errorName = "Unauthorized";
                    break;
                case ERROR402:
                    errorName = "Payment Required";
                    break;
                case ERROR403:
                    errorName = "Forbidden";
                    break;
                case ERROR404:
                    errorName = "Not Found";
                    break;
                case ERROR405:
                    errorName = "Method Not Allowed";
                    break;
                case ERROR406:
                    errorName = "Not Acceptable";
                    break;
                case ERROR407:
                    errorName = "Proxy Authentication Required";
                    break;
                case ERROR408:
                    errorName = "Request Timeout";
                    break;
                case ERROR409:
                    errorName = "Conflict";
                    break;
                case ERROR410:
                    errorName = "Gone";
                    break;
                case ERROR411:
                    errorName = "Length Required";
                    break;
                case ERROR412:
                    errorName = "Precondition Failed";
                    break;
                case ERROR413:
                    errorName = "Payload Too Large";
                    break;
                case ERROR414:
                    errorName = "URI Too Long";
                    break;
                case ERROR415:
                    errorName = "Unsupported Media Type";
                    break;
                case ERROR416:
                    errorName = "Range Not Satisfiable";
                    break;
                case ERROR417:
                    errorName = "Expectation Failed";
                    break;
                case ERROR418:
                    errorName = "Im a teapot";
                    break;
                case ERROR419:
                    errorName = "Authentication Timeout";
                    break;
                case ERROR421:
                    errorName = "Misdirected Request";
                    break;
                case ERROR422:
                    errorName = "Unprocessable Entity";
                    break;
                case ERROR423:
                    errorName = "Locked";
                    break;
                case ERROR424:
                    errorName = "Failed Dependency";
                    break;
                case ERROR425:
                    errorName = "Too Early";
                    break;
                case ERROR426:
                    errorName = "Upgrade Required";
                    break;
                case ERROR428:
                    errorName = "Precondition Required";
                    break;
                case ERROR429:
                    errorName = "Too Many Requests";
                    break;
                case ERROR431:
                    errorName = "Request Header Fields Too Large)";
                    break;
                case ERROR449:
                    errorName = "Retry With";
                    break;
                case ERROR451:
                    errorName = "Unavailable For Legal Reasons";
                    break;
                case ERROR499:
                    errorName = "Client Closed Request";
                    break;
                default:
                    errorName = "There is not error with this number";
                    break;
            }
            return errorName;
        }
    }
   /* Bad_Request(400),
    Unauthorized(401),
    Payment_Required(402),
    Forbidden(403),
    Not_Found(404),
    Method_Not_Allowed(405),
    Not_Acceptable(406),
    Proxy_Authentication_Required(407),
    Request_Timeout(408),
    Conflict(409),
    Gone(410),
    Length_Required(411),
    Precondition_Failed(412),
    Payload_Too_Large(413),
    URI_Too_Long(414),
    Unsupported_Media_Type(415),
    Range_Not_Satisfiable(416),
    Expectation_Failed(417),
    Im_a_teapot(418),
    Authentication_Timeout(419),
    Misdirected_Request(421),
    Unprocessable_Entity(422),
    Locked(423),
    Failed_Dependency(424),
    Too_Early(425),
    Upgrade_Required(426),
    Precondition_Required(428),
    Too_Many_Requests(429),
    Request_Header_Fields_Too_Large(431),
    Retry_With(449),
    Unavailable_For_Legal_Reasons(451),
    Client_Closed_Request(499);*/

