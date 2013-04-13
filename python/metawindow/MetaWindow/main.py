#
#  main.py
#  MetaWindow
#
#  Created by Aaron  Crosley on 6/30/12.
#  Copyright __MyCompanyName__ 2012. All rights reserved.
#

#import modules required by application
import objc
import Foundation
import AppKit

from PyObjCTools import AppHelper

# import modules containing classes required to start application and load MainMenu.nib
import MetaWindowAppDelegate

# pass control to AppKit
AppHelper.runEventLoop()
