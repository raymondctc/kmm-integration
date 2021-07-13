//
//  SimpleLoginApp.swift
//  SimpleLogin
//
//  Created by raymond on 13/7/2021.
//

import SwiftUI
import ModuleCore
import ModuleA

@main
struct SimpleLoginApp: App {
    var body: some Scene {
        WindowGroup {
            let sharedClass = SharedClass(scope: AppCoroutineScope())
            ContentView()
        }
    }
}
