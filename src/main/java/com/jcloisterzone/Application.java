package com.jcloisterzone;

/**
 * Various application constants.
 * @author Roman Krejcik
 */
public interface Application {

    public String DEV_VERSION = "dev-snapshot";

    public String VERSION = "3.1.0-beta1";
    public String BUILD_DATE = "2015-01-25";

    public String PROTCOL_VERSION = "3.1.0b"; //since 3.1-beta1

    public static final String ILLEGAL_STATE_MSG = "Method '{}' called in invalid state";
}
