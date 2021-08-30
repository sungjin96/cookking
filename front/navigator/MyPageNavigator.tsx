import React from 'react'
import { createStackNavigator } from '@react-navigation/stack'
import MyPage from '../pages/MyPage'

export type MyPageNavigatorParams = {
    MyPage: undefined
}

const Stack = createStackNavigator<MyPageNavigatorParams>()

function MyPageNavigator() {
    return (
        <Stack.Navigator>
            <Stack.Screen name="MyPage" component={MyPage} />
        </Stack.Navigator>
    )
}

export default MyPageNavigator