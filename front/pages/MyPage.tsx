import React from 'react'
import Container from '../components/Container'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function MyPage() {
    const navigation = useNavigation()
    return (
        <Container>
            <Text>마이페이지</Text>
        </Container>
    )
}

export default MyPage