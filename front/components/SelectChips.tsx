import React, { useState } from 'react'
import { Pressable, StyleSheet, Text, View } from 'react-native';
import styled, {css} from 'styled-components/native'
import {COLORS, FONTSIZES, FONTS} from '../constants'


// 효율적이고 간편한 방법으로 계속 개선할 예정

interface CheckedProps {
	checkedTest?: boolean;
}

function Chips() {

	const Chips = styled.Pressable<CheckedProps>`
		width: auto;
		padding: 8px 12px;
		margin-right: 8px;
		background-color: ${COLORS.white};
		border-radius: 50px;
		border: 1px solid ${COLORS.gray200};
		${props => props.checkedTest && css`
			background-color: ${COLORS.primary100};
			border: 1px solid ${COLORS.primary700};
		`}
	`
	const ChipsText = styled.Text<CheckedProps>`
		${FONTS.fontLegular};
		font-size: ${FONTSIZES.body3}px;
		color: ${COLORS.gray700};
		${props => props.checkedTest && css`
			${FONTS.fontMedium};
			color: ${COLORS.primary700};
		`}
	`

	const [checked, setChecked] = useState(false);

	const handleToggle = () => {
        setChecked(!checked)
    }

	return (
		<Chips onPress={handleToggle} checkedTest={checked}>
			<ChipsText checkedTest={checked}>여기에 값이 들어감</ChipsText>
		</Chips>
	);
};

export default Chips