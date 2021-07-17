import React from 'react'
import Container from '../components/Container'
import Button from '../components/Button'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function Home() {
	const navigation = useNavigation()
	return (
		<Container>
			<Text>Home</Text>
			<Button title="카운터로" onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })} />
		</Container>
	)
}

export default Home
