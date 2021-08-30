import React from 'react'
import Container from '../components/Container'
import Button from '../components/Button'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function Post() {
    const navigation = useNavigation()
    return (
        <Container>
            <Text>포스트</Text>
        </Container>
    )
}

export default Post