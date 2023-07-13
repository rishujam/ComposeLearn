package com.example.composelearn.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearn.ui.theme.DefaultTextColor
import com.example.composelearn.ui.theme.LightBgGreen
import com.example.composelearn.ui.theme.MediumGreen

/*
 * Created by Sudhanshu Kumar on 06/07/23.
 */

@Preview
@Composable
fun VerifyPhoneView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 32.dp)
    ) {
        Row {
            Text(
                text = "9999999999",
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 16.dp),
                fontWeight = FontWeight.Medium
            )
            Text(
                color = MediumGreen,
                modifier = Modifier
                    .padding(start = 16.dp),
                text = "Wrong Number?",
                fontWeight = FontWeight.Bold
            )
        }
        OtpEditText()
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBgGreen,
                    contentColor = MediumGreen
                )
            ) {
                Text(
                    text = "Verify",
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Row {
            Text(
                modifier = Modifier.padding(start = 16.dp, top = 8.dp),
                text = "Didn't Received OTP?",
                fontWeight = FontWeight.Medium
            )
            Text(
                modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                text = "Resend in 45 sec",
                fontWeight = FontWeight.Bold,
                color = MediumGreen
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtpEditText() {
    var otp1 by remember {
        mutableStateOf("")
    }
    var otp2 by remember {
        mutableStateOf("")
    }
    var otp3 by remember {
        mutableStateOf("")
    }
    var otp4 by remember {
        mutableStateOf("")
    }
    var otp5 by remember {
        mutableStateOf("")
    }
    var otp6 by remember {
        mutableStateOf("")
    }
    Row(modifier = Modifier
        .padding(top = 16.dp)
        .fillMaxWidth()) {
        Box {
            OutlinedTextField(
                value = otp1,
                onValueChange = {

                },
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
        Box(modifier = Modifier.padding(start = 16.dp)) {
            OutlinedTextField(
                value = otp2,
                onValueChange = {},
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
        Box(modifier = Modifier.padding(start = 16.dp)) {
            OutlinedTextField(
                value = otp3,
                onValueChange = {},
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
        Box(modifier = Modifier.padding(start = 16.dp)) {
            OutlinedTextField(
                value = otp4,
                onValueChange = {},
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
        Box(modifier = Modifier.padding(start = 16.dp)) {
            OutlinedTextField(
                value = otp5,
                onValueChange = {},
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
        Box(modifier = Modifier.padding(start = 16.dp)) {
            OutlinedTextField(
                value = otp6,
                onValueChange = {

                },
                modifier = Modifier
                    .width(48.dp)
                    .aspectRatio(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MediumGreen,
                    unfocusedBorderColor = DefaultTextColor,
                    cursorColor = MediumGreen,
                    textColor = DefaultTextColor
                )
            )
        }
    }
}