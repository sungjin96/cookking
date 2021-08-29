import styled, { css } from 'styled-components/native';
import { COLORS, FONTSIZES, FONTS } from '../constants'

interface StyledBtnProps {
	// color
	primary_500? : boolean;
	primary_600? : boolean;
	primary_700? : boolean;

	// type
	text? : boolean;
	bottomFixed? : boolean;

	// round : 기본 solid
	round? : boolean;

	// height
	large? : boolean;
	// medium? : boolean;
	small? : boolean;

}

interface StyledBtnContProps {
	white? : boolean;
	disabled? : boolean;
}

export const ButtonText = styled.Text<StyledBtnContProps>`
	${FONTS.fontMedium};
	font-size: ${FONTSIZES.body3}px;
	color: ${props => (props.white ? `${COLORS.white}` : `${COLORS.gray_700}`)};
`

const Button = styled.TouchableOpacity<StyledBtnProps>`
	width: 100%;
	flex: 1;
	align-items: center;
	justify-content: center;
	min-height: 32px;
	max-height: 32px;
	border-radius: 4px;
	background-color: ${COLORS.gray_200};

	${props => props.primary_700 && css` background-color: ${COLORS.primary_700};`}
	${props => props.primary_600 && css` background-color: ${COLORS.primary_600};`}
	${props => props.primary_500 && css && css
	` background-color: ${COLORS.primary_500};`}

	${props => props.text && css` ${COLORS.transparent}`}
	${props => props.bottomFixed && css`
		margin: 0 -16px;
		max-height: 60px;
		border-radius: 0;
	`}

	${props => props.round && css` border-radius: 50px;`}

	${props => props.large && css` max-height: 45px; `}
	${props => props.small && css`max-height: 22px; `}
`

export default Button