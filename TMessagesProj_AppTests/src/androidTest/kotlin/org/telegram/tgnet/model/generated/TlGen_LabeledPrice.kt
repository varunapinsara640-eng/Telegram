package org.wooble.tgnet.model.generated

import kotlin.Long
import kotlin.String
import kotlin.UInt
import org.wooble.tgnet.OutputSerializedData
import org.wooble.tgnet.model.TlGen_Object
import org.wooble.tgnet.model.TlGen_Vector

public sealed class TlGen_LabeledPrice : TlGen_Object {
  public data class TL_labeledPrice(
    public val label: String,
    public val amount: Long,
  ) : TlGen_LabeledPrice() {
    public override fun serializeToStream(stream: OutputSerializedData) {
      stream.writeInt32(MAGIC.toInt())
      stream.writeString(label)
      stream.writeInt64(amount)
    }

    public companion object {
      public const val MAGIC: UInt = 0xCB296BF8U
    }
  }
}
