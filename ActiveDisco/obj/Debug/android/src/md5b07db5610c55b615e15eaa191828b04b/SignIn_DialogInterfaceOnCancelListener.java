package md5b07db5610c55b615e15eaa191828b04b;


public class SignIn_DialogInterfaceOnCancelListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:(Landroid/content/DialogInterface;)V:GetOnCancel_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("SigninQuickstart.SignIn+DialogInterfaceOnCancelListener, ActiveDisco, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SignIn_DialogInterfaceOnCancelListener.class, __md_methods);
	}


	public SignIn_DialogInterfaceOnCancelListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SignIn_DialogInterfaceOnCancelListener.class)
			mono.android.TypeManager.Activate ("SigninQuickstart.SignIn+DialogInterfaceOnCancelListener, ActiveDisco, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCancel (android.content.DialogInterface p0)
	{
		n_onCancel (p0);
	}

	private native void n_onCancel (android.content.DialogInterface p0);

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
