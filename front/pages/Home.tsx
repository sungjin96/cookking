import React, {useState} from 'react'
import Container from '../components/Container'
import Button, { ButtonText } from '../components/Button'
import ButtonWrap from '../components/ButtonWrap'
import Icons from '../components/Icons'
import { icons } from '../constants'
import Chips from '../components/SelectChips'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'


function Home() {
	const navigation = useNavigation()

	const [states, setStates] = useState([
		{
			id: 1,
			label: 'text1',
			chacked: false
		},
		{
			id: 2,
			label: 'text222',
			chacked: true
		}
	])
	return (
		<Container>
			<Text>Home</Text>
			<Icons source={icons.bookmarkLine} iconSize="small"/>
			<Icons source={icons.checkedBookmark} />
			<ButtonWrap>
				<Button
					backgroundColor="primary500" 
					heightSize="large"
					round
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					backgroundColor="primary600"
					onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>카운터로</ButtonText>
				</Button>

				<Button
					backgroundColor="primary700"
					heightSize="small"
					onPress={() => navigation.navigate('Search', { title: '홈에서 눌렀다 임마!' })}
				>
					<ButtonText white>서치로</ButtonText>
				</Button>
			</ButtonWrap>

			{/* 임시로 ButtonWrap을 wrapper로 사용 */}
			<ButtonWrap>
				<Chips states={states} setStates={setStates}/>
			</ButtonWrap>

		</Container>
	)
}

export default Home
