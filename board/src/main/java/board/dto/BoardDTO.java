package board.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	private int bno;
	private String name;
	private String password;
	private String title;
	private String content;
	private String attach;
	private int re_ref;
	private int re_lev;
	private int re_seq;
	private int readCount;
	private Date regDate;

}
