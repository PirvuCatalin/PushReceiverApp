package openalpr.com.pushyapp.firebaseServices;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.iid.FirebaseInstanceId;

import static android.content.ContentValues.TAG;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    public MyFirebaseInstanceIdService(){
    }
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        System.out.println(refreshedToken);

        // the following line will send this refreshedToken to our app serrver, so app
        // server can save it
        // and can later use it for sending notification to app.
        //  we will probably send the token to the database (along with his registration info)

        // sendRegistrationToServer(refreshedToken);
    }
}