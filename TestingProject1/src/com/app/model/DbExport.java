package com.app.model;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class DbExport {
	
	public boolean backupDataWithDatabase(String dumpExePath, String host, String port, String user, String password, String database, String backupPath) {
        boolean status = false;
        try {
            Process p = null;
 
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            String filepath = "backup(with_DB)-" + database + "-" + host + "-(" + dateFormat.format(date) + ").sql";
 
            String batchCommand = "";
            if (password != "") {
                //Backup with database
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " --password=" + password + " --add-drop-database -B " + database + " -r \"" + backupPath + "" + filepath + "\"";
            } else {
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " --add-drop-database -B " + database + " -r \"" + backupPath + "" + filepath + "\"";
            }
 
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(batchCommand);
            int processComplete = p.waitFor();
 
            if (processComplete == 0) {
                status = true;
               System.out.println(("Backup created successfully for with DB " + database + " in " + host + ":" + port)); 
            } else {
                status = false;
                System.out.println(("Could not create the backup for with DB " + database + " in " + host + ":" + port));
            }
 
        } catch (IOException ioe) {
        	System.out.println(ioe.getCause());
        } catch (Exception e) {
        	System.out.println(e.getCause());
        }
        return status;
    }
}
