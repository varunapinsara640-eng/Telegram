package org.wooble.tgnet.model.generated

import kotlin.Int
import kotlin.UInt
import org.wooble.tgnet.OutputSerializedData
import org.wooble.tgnet.model.TlGen_Object
import org.wooble.tgnet.model.TlGen_Vector

public sealed class TlGen_AccountDaysTTL : TlGen_Object {
  public data class TL_accountDaysTTL(
    public val days: Int,
  ) : TlGen_AccountDaysTTL() {
    public override fun serializeToStream(stream: OutputSerializedData) {
      stream.writeInt32(MAGIC.toInt())
      stream.writeInt32(days)
    }

    public companion object {
      public const val MAGIC: UInt = 0xB8D0AFDFU
    }
  }
}
