package com.example.gasgame.Service;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class serviceNotify extends JobService {
    @Override//boolean  اى تاسك بدك ياها تشتغل بعد مده معينه وبترجع
    // عشان تشوف ازا بدك تشتغل بعد مده معيه او ع السؤيع
    public boolean onStartJob(JobParameters jobParameters) {
        return false;
    }

    @Override// يعني مثلا قطع الواى فاى فجاه(interrubt)لو سار مقاطعه
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}