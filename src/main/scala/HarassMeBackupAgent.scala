package net.rfc1149.harassme

import _root_.android.app.backup.{BackupAgentHelper, SharedPreferencesBackupHelper}

class HarassMeBackupAgent extends BackupAgentHelper {

  override def onCreate(): Unit =
    addHelper("prefs",
              new SharedPreferencesBackupHelper(this))

}