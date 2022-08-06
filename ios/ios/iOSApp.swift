import SwiftUI
import shared

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
            ContentView(viewModel: ContentView.DuaViewModel())
		}
	}
}
