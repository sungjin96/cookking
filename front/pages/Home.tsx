import React from 'react'
import Container from '../components/Container'
import Button, { ButtonText } from '../components/Button'
import ButtonWrap from '../components/ButtonWrap'
// import Input from '../components/TextInput'
import Chips from '../components/SelectChips'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function Home() {
	const navigation = useNavigation()
	return (
		<Container>
			<Text>Home</Text>
			<ButtonWrap>
				<Button
					BackgroundColor="primary500" 
					heightSize="large"
					round
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					BackgroundColor="primary600"
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					BackgroundColor="primary700"
					heightSize="small"
					onPress={() => navigation.navigate('Search', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>서치로</ButtonText>
				</Button>
			</ButtonWrap>

			{/* 임시로 ButtonWrap을 wrapper로 사용 */}
			<ButtonWrap>
				<Chips/>
				<Chips/>
			</ButtonWrap>

		</Container>
	)
}

export default Home
