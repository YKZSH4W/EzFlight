package com.example.ezflight.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.ezflight.R

@Composable
fun BackBtn(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(2.dp)
            .clickable { onClick() }
    ) {
       Icon(
           imageVector = ImageVector.vectorResource(id = R.drawable.angle_left_vector),
           tint = Color.Unspecified,
           contentDescription = "Arrow left",
           modifier = Modifier.size(30.dp),
       )
    }
}