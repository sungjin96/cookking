import React from 'react'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import HomeNavigator, { HomeNavigatorParams } from './HomeNavigator'
import SearchNavigator, { SearchNavigatorParams } from './SearchNavigator'
import PostNavigator, { PostNavigatorParams } from './PostNavigator'
import BookMarkNavigator, { BookMarkNavigatorParams } from './BookMarkNavigator'
import MyPageNavigator, { MyPageNavigatorParams } from './MyPageNavigator'
import { NavigatorScreenParams } from '@react-navigation/native'
import Icon from 'react-native-vector-icons/MaterialIcons'
export type AppNavigatorParams = {
	Home: NavigatorScreenParams<HomeNavigatorParams>
	Search: NavigatorScreenParams<SearchNavigatorParams>
	Post:NavigatorScreenParams<PostNavigatorParams>
	BookMark: NavigatorScreenParams<BookMarkNavigatorParams>
	MyPage: NavigatorScreenParams<MyPageNavigatorParams>
}

const Tab = createBottomTabNavigator<AppNavigatorParams>()

function AppNavigator() {
	return (
		<Tab.Navigator>
			<Tab.Screen 
				name="Home" 
				component={HomeNavigator} 
				options={{tabBarIcon: ({color}) => (
					<Icon name="home-filled" color={color} size={28} />
				)}}
			/>
			<Tab.Screen 
				name="Search" 
				component={SearchNavigator}
				options={{tabBarIcon: ({color}) => (
					<Icon name="search" color={color} size={28} />
				)}}
			/>
			<Tab.Screen 
				name="Post" 
				component={PostNavigator}
				options={{tabBarIcon: ({color}) => (
					<Icon name="add" color={color} size={28} />
				)}}
			/>
			<Tab.Screen 
				name="BookMark" 
				component={BookMarkNavigator}
				options={{tabBarIcon: ({color}) => (
					<Icon name="bookmark" color={color} size={28} />
				)}}
			/>
			<Tab.Screen 
				name="MyPage" 
				component={MyPageNavigator} 
				options={{tabBarIcon: ({color}) => (
					<Icon name="home" color={color} size={28} />
				)}}
			/>
		</Tab.Navigator>
	)
}

export default AppNavigator
