//
//  DuaViewModel.swift
//  ios
//
//  Created by isfhani.ghiath on 06/08/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

extension ContentView {
    class DuaViewModel : ObservableObject {
        @Published var text = "Loading..."
        let getDua = DuaModule().getUseCase()
        
        init() {
            getDua.execute { result, error in
                DispatchQueue.main.async {
                    if let result = result {
                        var name = ""
                        
                        result.forEach { dua in
                            name += dua.name + "\n"
                        }
                        
                        self.text = name
                    } else {
                        self.text = error?.localizedDescription ?? "ops!"
                    }
                }
            }
        }
    }
}
