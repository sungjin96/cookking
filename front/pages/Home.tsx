import React from 'react'
import Container from '../components/Container'
import Button, { ButtonText } from '../components/Button'
import ButtonWrap from '../components/ButtonWrap'
// import Input from '../components/TextInput'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function Home() {
	const navigation = useNavigation()
	return (
		<Container>
			<Text>Home</Text>
			<ButtonWrap>
				<Button
					color="primary_500" 
					size="large"
					round
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					color="primary_600"
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					color="primary_700"
					size="small"
					onPress={() => navigation.navigate('Search', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>서치로</ButtonText>
				</Button>
			</ButtonWrap>
		</Container>
	)
}

export default Home
