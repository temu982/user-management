

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConf
{
        private SharedPreferences sharedPreferences;
        private Context context;
        private static final String pref="p1";
        private static final String prefStatus="p1";
        public SharedPreferenceConf(Context context)
        {
            this.context=context;
            sharedPreferences= context.getSharedPreferences(pref, Context.MODE_PRIVATE);

        }
        public void writeLogInStatus(boolean bool)
        {
            SharedPreferences.Editor editor= sharedPreferences.edit();
            editor.putBoolean(prefStatus, bool);
            editor.commit();
        }
        public boolean readLogInStatus()
        {
            return sharedPreferences.getBoolean(prefStatus,false);
        }
}
