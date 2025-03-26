

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class webmethods_scheduler_app

{
	// ---( internal utility methods )---

	final static webmethods_scheduler_app _instance = new webmethods_scheduler_app();

	static webmethods_scheduler_app _newInstance() { return new webmethods_scheduler_app(); }

	static webmethods_scheduler_app _cast(Object o) { return (webmethods_scheduler_app)o; }

	// ---( server methods )---




	public static final void getStringvalues_javaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getStringvalues_javaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required employeeId
		// [i] field:0:required employeeName
		// [i] field:0:required employeeAge
		// [i] field:0:required employeeAddress
		// [i] field:0:required employeeMail
		// [o] field:0:required outputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	employeeId = IDataUtil.getString( pipelineCursor, "employeeId" );
			String	employeeName = IDataUtil.getString( pipelineCursor, "employeeName" );
			String	employeeAge = IDataUtil.getString( pipelineCursor, "employeeAge" );
			String	employeeAddress = IDataUtil.getString( pipelineCursor, "employeeAddress" );
			String	employeeMail = IDataUtil.getString( pipelineCursor, "employeeMail" );
		pipelineCursor.destroy();
		
		String outputString = employeeId + "," + employeeName + "," + employeeAge + "," + employeeAddress + "," + employeeMail;
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", outputString );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

