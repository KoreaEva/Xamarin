using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

using HockeyApp.Android;
using System.Collections.Generic;

namespace HockeyAppTest
{
    [Activity(Label = "HockeyAppTest", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        int count = 1;

        Button btnClickMe;
        Button btnCrash;
        Button btnFeedback;

        string AppID = "cbfdc8cafd4348e68f0da72b0ebf5f8c";

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            // Get our button from the layout resource,
            // and attach an event to it
            btnClickMe = FindViewById<Button>(Resource.Id.btnClickMe);
            btnCrash = FindViewById<Button>(Resource.Id.btnCrash);
            btnFeedback = FindViewById<Button>(Resource.Id.btnFeedback);

            btnClickMe.Click += Button_Click;
            btnCrash.Click += BtnCrash_Click;
            btnFeedback.Click += BtnFeedback_Click;
                
            //HockeyApp 관련 추가 코드
            CrashManager.Register(this, AppID);
            FeedbackManager.Register(this, AppID);

        }

        private void BtnFeedback_Click(object sender, EventArgs e)
        {
            FeedbackManager.ShowFeedbackActivity(ApplicationContext);
        }

        private void BtnCrash_Click(object sender, EventArgs e)
        {
            //Crash!!
            int a = 37;
            a = a / 0;
        }

        private void Button_Click(object sender, EventArgs e)
        {
              btnClickMe.Text = string.Format("{0} clicks!", count++);
        }
    }
}

