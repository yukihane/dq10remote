package yukihane.dq10remote.exception;

/**
 * アプリケーション内で発生させる/発生する例外の種類を定義するenumです.
 * それぞれに対応するユーザー表示用のメッセージが定義されており,
 * {@link yukihane.dq10remote.ViewUtils#getErrorMsg(android.content.Context, ErrorCode, Object...)}
 * で取得することができます.
 */
public final class ErrorCode {

    public static final int ERROR = 0;
    /**
     * 報告済みです.
     */
    public static final int REPORTED = 1;
}
