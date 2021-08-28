import React from 'react'
import Container from '../components/Container'
import { Btn, BtnCont } from '../components/Button'
// import Input from '../components/TextInput'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function Home() {
	const navigation = useNavigation()
	return (
		<Container>
			<Text>Home</Text>
			<Btn primary_1 round_5 onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}>
				<BtnCont primary>카운터로</BtnCont>
			</Btn>
		</Container>
	)
}

export default Home
