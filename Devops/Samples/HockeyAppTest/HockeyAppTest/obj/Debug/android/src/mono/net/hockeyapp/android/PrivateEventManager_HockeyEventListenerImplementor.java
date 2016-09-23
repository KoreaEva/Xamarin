package mono.net.hockeyapp.android;


public class PrivateEventManager_HockeyEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		net.hockeyapp.android.PrivateEventManager.HockeyEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHockeyEvent:(Lnet/hockeyapp/android/PrivateEventManager$Event;)V:GetOnHockeyEvent_Lnet_hockeyapp_android_PrivateEventManager_Event_Handler:HockeyApp.Android.PrivateEventManager/IHockeyEventListenerInvoker, HockeySDK.AndroidBindings\n" +
			"";
		mono.android.Runtime.register ("HockeyApp.Android.PrivateEventManager+IHockeyEventListenerImplementor, HockeySDK.AndroidBindings, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PrivateEventManager_HockeyEventListenerImplementor.class, __md_methods);
	}


	public PrivateEventManager_HockeyEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PrivateEventManager_HockeyEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("HockeyApp.Android.PrivateEventManager+IHockeyEventListenerImplementor, HockeySDK.AndroidBindings, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onHockeyEvent (net.hockeyapp.android.PrivateEventManager.Event p0)
	{
		n_onHockeyEvent (p0);
	}

	private native void n_onHockeyEvent (net.hockeyapp.android.PrivateEventManager.Event p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
