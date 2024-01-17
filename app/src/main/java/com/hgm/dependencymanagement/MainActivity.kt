package com.hgm.dependencymanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hgm.dependencymanagement.ui.theme.DependencyManagementTheme

/**
 *    如何在多模块中管理不同的依赖项
 **/
class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                  DependencyManagementTheme {
                        Surface(
                              modifier = Modifier.fillMaxSize(),
                              color = MaterialTheme.colorScheme.background
                        ) {

                        }
                  }
            }
      }
}
