package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun SimpleScreen(
    modifier: Modifier = Modifier
) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.strelka),
            contentDescription = null,
        )
        Text(
            stringResource(id = R.string.sing_in)

        )

    }
}

@Preview(name = "SimpleScreen")
@Composable
private fun PreviewSimpleScreen() {
    MyApplicationTheme{
        SimpleScreen()
    }
}

//fun AuthContentEmailSent(
//    email: String,
//    isEmailError: Boolean,
//    onEmailChange: (String) -> Unit,
//    onSendCodeClick: () -> Unit,
//) {
//    Column(
//        modifier = Modifier
//            .verticalScroll(rememberScrollState())
//            .fillMaxWidth()
//            .padding(paddingValues = PaddingValues(Sizes.Paddings.dp32)),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        ImageContainer(
//            modifier = Modifier.padding(bottom = Sizes.Paddings.dp24),
//            imageId = R.drawable.ic_letter
//        )
//        Text(
//            modifier = Modifier.padding(bottom = Sizes.Paddings.dp10),
//            text = stringResource(id = R.string.auth_welcome_title),
//            style = getAppThemeTypography().displayMedium
//        )
//        Text(
//            modifier = Modifier.padding(bottom = Sizes.Paddings.dp32),
//            text = stringResource(id = R.string.auth_welcome_subtitle),
//            style = getAppThemeTypography().displayMedium.copy(
//                color = Color.Black
//            )
//        )
//        Text(
//            modifier = Modifier.align(Alignment.Start),
//            text = stringResource(id = R.string.default_email_title),
//            style = getAppThemeTypography().displayMedium.copy(
//                color = Color.Black
//            )
//        )
//
//        BaseTextField(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(
//                    top = Sizes.Paddings.dp8,
//                    bottom = Sizes.Paddings.dp16
//                )
//                .align(Alignment.CenterHorizontally),
//            value = email,
//            hint = stringResource(R.string.default_email_hint),
//            isError = isEmailError,
//            errorText = stringResource(id = R.string.default_email_error),
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//            onValueChange = onEmailChange
//        )
//
//        BaseButtonUi(
//            imageId = R.drawable.ic_message,
//            textId = R.string.auth_welcome_send_code_button,
//            onClick = onSendCodeClick
//        )
//    }
//}