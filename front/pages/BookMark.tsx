import React from 'react'
import Container from '../components/Container'
import Button from '../components/Button'
import { Text } from 'react-native'
import { useNavigation } from '@react-navigation/native'

function BookMark() {
    const navigation = useNavigation()
    return (
        <Container>
            <Text>북마크</Text>
        </Container>
    )
}

export default BookMark