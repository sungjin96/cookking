import React, {useState} from 'react'
import Container from '../components/Container'
import { useNavigation } from '@react-navigation/native'

import Card from '../components/Card'

function Home() {
	const navigation = useNavigation()
	return (
		<Container>
			<Card />
		</Container>
	)
}

export default Home
