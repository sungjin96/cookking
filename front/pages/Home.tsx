import React from 'react'
import Container from '../components/Container'
import Button from '../components/Button'
import { Text, SafeAreaView, FlatList, StatusBar, StyleSheet } from 'react-native'
import { Ionicons } from '@expo/vector-icons'
import { useNavigation } from '@react-navigation/native'
import { View } from 'react-native-animatable'

function Home() {
	const navigation = useNavigation()
	const DATA = [
		{
		  id: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
		  title: 'First Item',
		},
		{
		  id: '3ac68afc-c605-48d3-a4f8-fbd91aa97f63',
		  title: 'Second Item',
		},
		{
		  id: '58694a0f-3da1-471f-bd96-145571e29d72',
		  title: 'Third Item',
		},
	  ];
	//   const Item = ({ title }) => (
	// 	<View style={styles.item}>
	// 	  <Text style={styles.title}>{title}</Text>
	// 	</View>
	//   );
	  const renderItem = () => (
		<Text>dd</Text>
	  );
	return (
		<Container>
			<Text>Home</Text>
			{/* <Button title="카운터로" onPress={() => navigation.navigate('Count', { title: '홈에서 눌렀다 임마!' })} />
      <Button title="BookMark" onPress={() => navigation.navigate('BookMark')} /> */}
	  	<SafeAreaView style={styles.container}>
		<FlatList
			data={DATA}
			renderItem={renderItem}
			keyExtractor={item => item.id}
		/>
		</SafeAreaView>
		</Container>
	)
}
const styles = StyleSheet.create({
	container: {
	  flex: 1,
	  marginTop: StatusBar.currentHeight || 0,
	},
	item: {
	  backgroundColor: '#f9c2ff',
	  padding: 20,
	  marginVertical: 8,
	  marginHorizontal: 16,
	},
	title: {
	  fontSize: 32,
	},
  });
export default Home
