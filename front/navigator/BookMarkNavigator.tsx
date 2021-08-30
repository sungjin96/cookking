import React from 'react'
import { createStackNavigator } from '@react-navigation/stack'
import BookMark from '../pages/BookMark'

export type BookMarkNavigatorParams = {
    BookMark: undefined
}

const Stack = createStackNavigator<BookMarkNavigatorParams>()

function BookMarkNavigator() {
    return (
        <Stack.Navigator>
            <Stack.Screen name="BookMark" component={BookMark} />
        </Stack.Navigator>
    )
}

export default BookMarkNavigator