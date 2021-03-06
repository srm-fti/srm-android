package id.ukdw.srmmobile.utils;

/**
 * Project: SRM-BE
 * Package: PACKAGE_NAME
 * <p>
 * Creator: dendy
 * Date: 6/30/2020
 * Time: 7:44 AM
 * <p>
 * Description : for placed all apps Constants
 */
public final class AppConstants {

    public static final String CLIENT_TYPE = "mobile_app";

    public static final String DB_NAME = "srm.db";

    public static final long NULL_INDEX = -1L;

    public static final String PREF_NAME = "srm_pref";

    public static final String SEED_DATABASE_OPTIONS = "seed/options.json";

    public static final String SEED_DATABASE_QUESTIONS = "seed/questions.json";

    public static final String STATUS_CODE_FAILED = "failed";

    public static final String STATUS_CODE_SUCCESS = "success";

    public static final String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";

    public static final String GOOGLE_SERVER_CLIENT_ID = "527371133243-9tr4gvi7vic5g3b3p5fr10dtrgs4kvgo.apps.googleusercontent.com";

    public static final String SCOPE_GOOGLE_CALENDAR = "https://www.googleapis.com/auth/calendar";

    public static final String BASE_URL = "https://apps.dw.fti.ukdw.ac.id/srm/";

    //public static final String BASE_URL = "http://192.168.137.1:8080";

    public static final int RETROFIT_CONNECTION_TIMEOUT = 10;

    public static final int RETROFIT_READ_TIMEOUT = 30;

    public static final int RETROFIT_READ_TIMEOUT_SYNCRONIZE = 60;

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}
