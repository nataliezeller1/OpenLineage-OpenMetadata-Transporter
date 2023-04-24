/*
/* Copyright 2018-2022 contributors to the OpenLineage project
/* SPDX-License-Identifier: Apache-2.0
*/

package io.openlineage.client.transports.customTransport;

import io.openlineage.client.transports.TransportConfig;
import lombok.*;

@NoArgsConstructor
@ToString
@Data
public final class TestTransportConfig implements TransportConfig {
  private String param1;
  private String param2;
}
